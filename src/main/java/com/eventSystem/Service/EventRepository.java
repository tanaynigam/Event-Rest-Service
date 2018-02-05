package com.eventSystem.Service;

import com.eventSystem.model.Event_data;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event_data, Long> {
}
