package site.kellysday.kellysday.global.audit;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // TODO : 인증 기능 구현시 수정
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String userName = (authentication != null) ? authentication.getName() : "";
//
//        return Optional.of(userName);
        return Optional.of("tester");
    }
}
