package ie.keithmurphy.questdemo.repo;

import ie.keithmurphy.questdemo.beans.RecordBean;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecordRepository extends CrudRepository<RecordBean, String> {

    // Custom method to retrieve by PPS.
    List<RecordBean> findByPps(String  pps);

}
