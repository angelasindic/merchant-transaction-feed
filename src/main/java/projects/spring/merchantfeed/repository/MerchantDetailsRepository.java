package projects.spring.merchantfeed.repository;

import java.util.Optional;

public interface MerchantDetailsRepository {
    Optional<String> findMerchantLogo(String merchantName);
}
