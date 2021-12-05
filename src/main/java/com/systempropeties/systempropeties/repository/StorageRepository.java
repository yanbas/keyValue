package com.systempropeties.systempropeties.repository;

import com.systempropeties.systempropeties.model.StorageModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageRepository extends JpaRepository<StorageModel, String> {

}
