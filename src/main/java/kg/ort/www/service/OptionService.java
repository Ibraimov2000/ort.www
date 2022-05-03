package kg.ort.www.service;

import kg.ort.www.entity.Option;
import kg.ort.www.repository.OptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionService {

    private final OptionRepository optionRepository;

    @Autowired
    public OptionService(OptionRepository optionRepository) {
        this.optionRepository = optionRepository;
    }

    public Option save(Option option) {
        return optionRepository.saveAndFlush(option);
    }

    public void deleteAll(List<Option> options) {
        optionRepository.deleteAll(options);
    }
}
