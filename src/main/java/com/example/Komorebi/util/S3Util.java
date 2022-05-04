package com.example.Komorebi.util;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.InputStream;

@AllArgsConstructor
@Component
public class S3Util {
    private final AmazonS3 amazonS3;

    public void upload(String path,
                       String fileName,
                       InputStream stream) {
        try {
            ObjectMetadata objectMetadata = new ObjectMetadata();
            amazonS3.putObject(new PutObjectRequest(path, fileName, stream,objectMetadata)
                    .withCannedAcl(CannedAccessControlList.PublicRead));
        } catch (AmazonServiceException e) {
            throw new IllegalStateException("Failed to upload the file", e);
        }
    }
}
