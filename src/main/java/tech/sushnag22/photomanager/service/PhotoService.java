package tech.sushnag22.photomanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.sushnag22.photomanager.model.Photo;
import tech.sushnag22.photomanager.repository.PhotoRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhotoService {
    @Autowired
    PhotoRepository photoRepository;

    public List<Photo> getAllPhotos() {
        return new ArrayList<Photo>(photoRepository.findAll());
    }

    public Photo getPhotoById(int id) {
        return photoRepository.findById(id).get();
    }

    public void delete(int id){
        photoRepository.deleteById(id);
    }

    public Photo save(String fileName, String contentType, byte[] data) {
        Photo photo = new Photo();
        photo.setContentType(contentType);
        photo.setFileName(fileName);
        photo.setData(data);
        photoRepository.save(photo);
        return photo;
    }

}
