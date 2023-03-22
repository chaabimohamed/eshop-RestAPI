package com.eshop.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.eshop.api.model.Image;
public interface ImageRepository extends JpaRepository<Image,Long>{

}
