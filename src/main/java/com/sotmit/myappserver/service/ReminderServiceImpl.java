package com.sotmit.myappserver.service;

import com.sotmit.myappserver.entity.Remind;
import com.sotmit.myappserver.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderServiceImpl implements ReminderService {

    @Autowired
    private RemindRepository repository;

    public List<Remind> getAll() {
        return repository.findAll();
    }

    @Override
    public Remind getById(long id) {
        return repository.findOne(id);
    }

    @Override
    public Remind save(Remind remind) {
        return repository.saveAndFlush(remind);
    }

    @Override
    public void remove(long id) {
        repository.delete(id);
    }
}
