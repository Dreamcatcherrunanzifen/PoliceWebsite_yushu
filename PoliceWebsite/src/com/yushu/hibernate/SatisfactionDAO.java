package com.yushu.hibernate;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Satisfaction entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.yushu.hibernate.Satisfaction
 * @author MyEclipse Persistence Tools
 */

public class SatisfactionDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(SatisfactionDAO.class);
	// property constants
	public static final String QUESTION = "question";
	public static final String ANSWER = "answer";
	public static final String PUBLISHER_IP = "publisherIp";

	public void save(Satisfaction transientInstance) {
		log.debug("saving Satisfaction instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Satisfaction persistentInstance) {
		log.debug("deleting Satisfaction instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Satisfaction findById(java.lang.Integer id) {
		log.debug("getting Satisfaction instance with id: " + id);
		try {
			Satisfaction instance = (Satisfaction) getSession().get(
					"com.yushu.hibernate.Satisfaction", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Satisfaction instance) {
		log.debug("finding Satisfaction instance by example");
		try {
			List results = getSession()
					.createCriteria("com.yushu.hibernate.Satisfaction")
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
		log.debug("finding Satisfaction instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Satisfaction as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByQuestion(Object question) {
		return findByProperty(QUESTION, question);
	}

	public List findByAnswer(Object answer) {
		return findByProperty(ANSWER, answer);
	}

	public List findByPublisherIp(Object publisherIp) {
		return findByProperty(PUBLISHER_IP, publisherIp);
	}

	public List findAll() {
		log.debug("finding all Satisfaction instances");
		try {
			String queryString = "from Satisfaction";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Satisfaction merge(Satisfaction detachedInstance) {
		log.debug("merging Satisfaction instance");
		try {
			Satisfaction result = (Satisfaction) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Satisfaction instance) {
		log.debug("attaching dirty Satisfaction instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Satisfaction instance) {
		log.debug("attaching clean Satisfaction instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}