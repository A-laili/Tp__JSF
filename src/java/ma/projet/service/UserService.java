/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import java.util.List;
import ma.projet.beans.Service;
import ma.projet.beans.User;
import ma.projet.dao.IDao;
import ma.projet.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author HP
 */
public class UserService implements IDao<User>{
    protected Class<User> getEntityClass() {
        return User.class;
    }
   public int nbrUsers(String username,String password){
           List<User> users;
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            users = session.createQuery("FROM User WHERE username = :username AND password = :password").setParameter("username", username).setParameter("password", password).list();
            session.getTransaction().commit();
            if (users==null){
                return 0;
            }else
            return users.size();
}

    @Override
    public boolean create(User o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(User o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(User o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}