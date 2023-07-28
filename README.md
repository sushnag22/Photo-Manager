# Photo-Manager
A photo uploader and downloader RESTful API application built with Spring Boot using Java.

The model class used is `Photo` with the following attributes:

1. `id`
2. `fileName`
3. `contentType`
4. `data`

Endoints for photo uploader:
1. POST : /photo/upload - Upload a new photo.
2. GET : /photo/upload - Get all the photos.
3. GET : /photo/upload/id - Get a photo by id.
4. DELETE : /photo/upload/id - Delete a photo with given id.

Endoints for photo downloader:
1. GET : /photo/download/id - Download a photo by id.

Postman Collection: https://api.postman.com/collections/17404613-cb23cab1-53c0-47e2-9434-ea982e55c57f?access_key=PMAT-01H6D9HZFZSFG2CKJEJVCMBB7Y
