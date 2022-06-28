package club.aibyte.service.Impl;

import club.aibyte.dao.UserDao;
import club.aibyte.entity.User;
import club.aibyte.service.UserService;
import club.aibyte.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Yang Chan
 * @Package_name club.aibyte.service.Impl
 * @Project_name Blog_YangChan
 * @Create 2022-06 23
 * @QQ群：339575270
 * @URL：www.aibyte.club
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
