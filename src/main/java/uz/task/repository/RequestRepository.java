package uz.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.task.domain.Request;

import java.util.Date;
import java.util.List;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {

//    Selection criteria 1
//    @Query("select r from Request r where r.correspondent = ?1 " +
//            "and r.registrationDate between ?2 and ?3")
    List<Request> findAllByCorrespondentAndRegistrationDateIsBetween(Integer correspondent,
                                                                     Date registrationDateBefore,
                                                                     Date registrationDateAfter);
//    Selection criteria 2
//    @Query("select r from Request r where r.correspondent = ?1 " +
//            "and r.deliveryForm = ?2 and r.registrationDate between ?3 and ?4")
    List<Request> findAllByCorrespondentAndDeliveryFormAndRegistrationDateBetween(Integer correspondent,
                                                                                  Integer deliveryForm,
                                                                                  Date registrationDateBefore,
                                                                                  Date registrationDateAfter);
//    Selection criteria 3
//    @Query("select r from Request r where r.registrationDate between ?1 " +
//          "and ?2 and r.correspondent <> ?3 and r.deliveryForm <> ?4")
    List<Request> findAllByRegistrationDateBetweenAndCorrespondentIsNotAndDeliveryFormIsNot(Date registrationDateBefore,
                                                                                            Date registrationDateAfter,
                                                                                            Integer correspondent,
                                                                                            Integer deliveryForm);
//    Selection criteria 4
//    @Query("select r from Request r where r.registrationDate between ?1 " +
//          "and ?2 and r.correspondent = ?3 and r.topic not like %?4%")
    List<Request> findAllByRegistrationDateBetweenAndCorrespondentAndTopicIsNotContaining(Date registrationDateBefore,
                                                                                          Date registrationDateAfter,
                                                                                          Integer correspondent,
                                                                                          String topic);

}
