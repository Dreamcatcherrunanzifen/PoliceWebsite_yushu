package com.yushu.hibernate;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * TableDownload entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.yushu.hibernate.TableDownload
 * @author MyEclipse Persistence Tools
 */

public class TableDownloadDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TableDownloadDAO.class);
	// property constants
	public static final String TABLE_TITLE = "tableTitle";
	public static final String TABLE_URL = "tableUrl";
	public static final String TABLE_CONTENT = "tableContent";

	public void save(TableDownload transientInstance) {
		log.debug("saving TableDownload instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TableDownload persistentInstance) {
		log.debug("deleting TableDownload instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TableDownload findById(java.lang.Integer id) {
		log.debug("getting TableDownload instance with id: " + id);
		try {
			TableDownload instance = (TableDownload) getSession().get(
					"com.yushu.hibernate.TableDownload", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TableDownload instance) {
		log.debug("finding TableDownload instance by example");
		try {
			List results = getSession()
					.createCriteria("com.yushu.hibernate.TableDownload")
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
		log.debug("finding TableDownload instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TableDownload as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTableTitle(Object tableTitle) {
		return findByProperty(TABLE_TITLE, tableTitle);
	}

	public List findByTableUrl(Object tableUrl) {
		return findByProperty(TABLE_URL, tableUrl);
	}

	public List findByTableContent(Object tableContent) {
		return findByProperty(TABLE_CONTENT, tableContent);
	}

	public List findAll() {
		log.debug("finding all TableDownload instances");
		try {
			String queryString = "from TableDownload";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TableDownload merge(TableDownload detachedInstance) {
		log.debug("merging TableDownload instance");
		try {
			TableDownload result = (TableDownload) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TableDownload instance) {
		log.debug("attaching dirty TableDownload instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TableDownload instance) {
		log.debug("attaching clean TableDownload instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}