package projects.spring.merchantfeed.repository;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class InMemoryMerchantDatailsRepository implements MerchantDetailsRepository {

    @Override
    public Optional<String> findMerchantLogo(String merchantName) {
        if (merchantName == null) {
            return Optional.empty();
        }

        return Optional.of(merchantName + ".png");
    }
}
