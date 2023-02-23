package skp.All.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import skp.All.entity.Student;

public class StudentRepository {
	public void saveStudent(Student student) { // insert the data
		EntityManagerFactory facrory = Persistence.createEntityManagerFactory("pavan");
		EntityManager entityManager = facrory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(student);
		transaction.commit();
	}
	public List findAll() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pavan");
		EntityManager entitymanager = factory.createEntityManager();
		Query query = entitymanager.createQuery("SELECT s FROM Student s");
		return query.getResultList();
	}

	public Student findById(Long id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pavan");
		EntityManager entityManager = factory.createEntityManager();
		return entityManager.find(Student.class, id);
	}
	
	public List findNames() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pavan");
		EntityManager entitymanager = factory.createEntityManager();
		Query query = entitymanager.createQuery("SELECT s.name FROM Student s");
		return query.getResultList();
	}
	public void delete(Long id) { // delete the value
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pavan");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Student student = manager.find(Student.class, id);
		manager.remove(student);
		transaction.commit();
	}

	public void updateStudent(Student student) { // updtae the value
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pavan");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(student);
		transaction.commit();
	}
	public List validateStudent(String name, String phoneNumber) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pavan");
		EntityManager entitymanager = factory.createEntityManager();
		Query query = entitymanager.createQuery("SELECT s. FROM Student s WHREE s.name=1? AND phoneNumber=2? ");
		query.setParameter(1, name);
		query.setParameter(1, phoneNumber);
		return query.getResultList();
	}
//
//	public List findphoneNumber() {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pavan");
//		EntityManager entitymanager = factory.createEntityManager();
//		Query query = entitymanager.createQuery("SELECT s.phoneNumber FROM Student s");
//		return query.getResultList();
//	}
//
//	public List findemial() {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pavan");
//		EntityManager entitymanager = factory.createEntityManager();
//		Query query = entitymanager.createQuery("SELECT s.emial FROM Student s");
//		return query.getResultList();
//	}
//
//	

}
