package com.sotmit.myappserver.service;

import com.sotmit.myappserver.entity.Remind;

import java.util.List;

/**
 * Created by MelnikOV on 005 05.04.16.
 */
public interface ReminderService {

    List<Remind> getAll ();
    Remind getById (long id);
    Remind save (Remind remind);
    void remove(long id);
}
