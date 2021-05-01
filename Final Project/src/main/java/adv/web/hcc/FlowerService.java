package adv.web.hcc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
    public class FlowerService implements IFlowerService {
        @Autowired
        private FlowerRepo repository;

        @Override
        public List<Flower> findAll() {

            return (List<Flower>) repository.findAll();
        }
    }

