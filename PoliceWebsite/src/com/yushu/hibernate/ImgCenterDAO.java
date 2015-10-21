package com.yushu.hibernate;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * ImgCenter entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.yushu.hibernate.ImgCenter
 * @author MyEclipse Persistence Tools
 */

public class ImgCenterDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ImgCenterDAO.class);
	// property constants
	public static final String IMG_SRC = "imgSrc";

	public void save(ImgCenter transientInstance) {
		log.debug("saving ImgCenter instance");
		try {
			Session session=getSession();
			Transaction tran = session.beginTransaction();	
			session.save(transientInstance);
			tran.commit();
			session.clear();
			session.close();
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ImgCenter persistentInstance) {
		log.debug("deleting ImgCenter instance");
		try {
			Session session=getSession();
			Transaction tran =session.beginTransaction();
			session.delete(persistentInstance);
			tran.commit();
			session.clear();
			session.close();
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ImgCenter findById(java.lang.Integer id) {
		log.debug("getting ImgCenter instance with id: " + id);
		try {
			ImgCenter instance = (ImgCenter) getSession().get(
					"com.yushu.hibernate.ImgCenter", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ImgCenter instance) {
		log.debug("finding ImgCenter instance by example");
		try {
			List results = getSession()
					.createCriteria("com.yushu.hibernate.ImgCenter")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ImgCenter instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ImgCenter as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByImgSrc(Object imgSrc) {
		return findByProperty(IMG_SRC, imgSrc);
	}

	public List findAll() {
		log.debug("finding all ImgCenter instances");
		try {
			String queryString = "from ImgCenter";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ImgCenter merge(ImgCenter detachedInstance) {
		log.debug("merging ImgCenter instance");
		try {
			ImgCenter result = (ImgCenter) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ImgCenter instance) {
		log.debug("attaching dirty ImgCenter instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ImgCenter instance) {
		log.debug("attaching clean ImgCenter instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}