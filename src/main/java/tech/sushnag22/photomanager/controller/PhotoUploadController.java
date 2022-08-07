package tech.sushnag22.photomanager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;
import tech.sushnag22.photomanager.model.Photo;
import tech.sushnag22.photomanager.service.PhotoService;

import java.io.IOException;
import java.util.List;

@RestController
public class PhotoUploadController {

    private final PhotoService photoService;

    public PhotoUploadController(PhotoService photoService) {
        this.photoService = photoService;
    }

    @GetMapping("/photo/upload")
    private List<Photo> getAllPhotos() {
        return photoService.getAllPhotos();
    }

    @GetMapping("/photo/upload/{id}")
    private Photo getPhoto(@PathVariable("id") int id) {
        Photo photo = photoService.getPhotoById(id);
        if (photo == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return photo;
    }

    @DeleteMapping("/photo/upload/{id}")
    public void delete(@PathVariable int id) {
        photoService.delete(id);
    }

    @PostMapping("/photo/upload")
    public Photo create(@RequestPart("data") MultipartFile file) throws IOException {
        return photoService.save(file.getOriginalFilename(), file.getContentType(), file.getBytes());
    }

}
