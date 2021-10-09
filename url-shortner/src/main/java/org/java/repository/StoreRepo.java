package org.java.repository;

import org.java.mpodel.url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepo extends JpaRepository<url, Long> {
	public url findByShorturl(String shortlink);
}
