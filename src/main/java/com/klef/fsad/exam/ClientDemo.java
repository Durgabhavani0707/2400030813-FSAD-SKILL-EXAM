package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ClientDemo
{
 public static void main(String[] args)
 {

  SessionFactory sf =
   new Configuration().configure().buildSessionFactory();

  Session session = sf.openSession();

  Transaction tx = session.beginTransaction();

  // INSERT RECORD
  Delivery d = new Delivery();
  d.setName("Bhavani");
  d.setDate("2026-03-11");
  d.setStatus("Delivered");
  d.setAddress("Vijayawada");

  session.save(d);

  System.out.println("Record Inserted Successfully");

  tx.commit();

  // DELETE USING HQL
  Transaction tx2 = session.beginTransaction();

  Query q = session.createQuery("delete from Delivery where id=?1");
  q.setParameter(1,1);

  int n = q.executeUpdate();

  System.out.println("Record Deleted : "+n);

  tx2.commit();

  session.close();
  sf.close();

 }
}