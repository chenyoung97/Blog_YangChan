package club.aibyte.service;

import club.aibyte.entity.Type;

import java.util.List;

/**
 * @Author Yang Chan
 * @Package_name club.aibyte.service.Impl
 * @Project_name Blog_YangChan
 * @Create 2022-06 23
 * @QQ群：339575270
 * @URL：www.aibyte.club
 */
public interface TypeService {
    int saveType(Type type);

    Type getType(Long id);

    List<Type> getAllType();

    Type getTypeByName(String name);

    int updateType(Type type);

    void deleteType(Long id);
}
