package club.aibyte.dao;

import club.aibyte.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author Yang Chan
 * @Package_name club.aibyte.dao
 * @Project_name Blog_YangChan
 * @Create 2022-06 23
 * @QQ群：339575270
 * @URL：www.aibyte.club
 */
@Mapper
@Repository
public interface UserDao {
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
