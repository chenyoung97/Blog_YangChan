package club.aibyte.service;

import club.aibyte.entity.User;

/**
 * @Author Yang Chan
 * @Package_name club.aibyte.service.Impl
 * @Project_name Blog_YangChan
 * @Create 2022-04 07
 * @QQ群：339575270
 * @URL：www.aibyte.club
 */
public interface UserService {
    User checkUser(String username, String password);
}
