package club.aibyte.dao;

import club.aibyte.entity.Type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Max;
import java.util.List;

/**
 * @Author Yang Chan
 * @Package_name club.aibyte.dao
 * @Project_name Blog_YangChan
 * @Create 2022-06 28
 * @QQ群：339575270
 * @URL：www.aibyte.club
 */
@Mapper
@Repository
public interface TypeDao {
    int saveType(Type type);

    Type getType(Long id);

    List<Type> getAllType();

    Type getTypeByName(String name);

    int updateType(Type type);

    void deleteType(Long id);
}
