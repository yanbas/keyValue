package com.systempropeties.systempropeties.services;


import com.systempropeties.systempropeties.model.StorageModel;

import java.util.Optional;

public interface StorageService {
    StorageModel create(StorageModel storageModel);
    Optional<StorageModel> findById(String id);
}
