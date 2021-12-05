package com.systempropeties.systempropeties.services;

import com.systempropeties.systempropeties.model.StorageModel;
import com.systempropeties.systempropeties.repository.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    StorageRepository storageRepository;

    @Override
    public StorageModel create(StorageModel storageModel) {
        return storageRepository.save(storageModel);
    }

    @Override
    public Optional<StorageModel> findById(String id) {
        return storageRepository.findById(id);
    }
}
