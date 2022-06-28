package club.aibyte.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Yang Chan
 * @Package_name club.aibyte.entity
 * @Project_name Blog_YangChan
 * @Create 2022-04 04
 * @QQ群：339575270
 * @URL：www.aibyte.club
 */
public class Type {

    private Long id;
    private String name;
    private List<Blog> blogs = new ArrayList<>();

    public Type() {
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", blogs=" + blogs +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}
