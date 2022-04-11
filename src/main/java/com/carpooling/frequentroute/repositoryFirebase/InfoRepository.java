package com.carpooling.frequentroute.repositoryFirebase;

import com.carpooling.frequentroute.model.Info;
import com.github.fabiomaffioletti.firebase.repository.DefaultFirebaseRealtimeDatabaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public class InfoRepository extends DefaultFirebaseRealtimeDatabaseRepository<Info, String> {
}
