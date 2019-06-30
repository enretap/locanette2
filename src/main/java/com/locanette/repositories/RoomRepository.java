package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{

}
