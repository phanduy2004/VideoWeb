package dao.interf;

import entity.Video;

import java.util.List;

public interface IVideoDao {
    void Insert(Video video);

    void Delete(Video video) throws Exception;

    void Update(Video video);

    Video FindById(String id);

    List<Video> FindAll();
    List<Video> FindListById(String id);
}
