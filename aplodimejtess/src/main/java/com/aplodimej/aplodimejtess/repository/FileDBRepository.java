package com.aplodimej.aplodimejtess.repository;


import com.aplodimej.aplodimejtess.model.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FileDBRepository extends  JpaRepository<FileDB, String> {
}
