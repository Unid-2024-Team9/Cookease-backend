package Cookease.com.dto.kakao;

import lombok.Getter;

import java.util.Properties;

public class KakaoDto {

    @Getter
    public static class OAuthToken {
        private String accessToken;
        private String token_type;
        private String refresh_token;
        private int expires_in;
        private String scope;
        private int refresh_token_expires_in;
    }

    @Getter
    public static class KakaoProfile {
        private Long id;
//        private String connectedAt;
//        private Properties properties;
        private KakaoAccount kakaoAccount;

//        @Getter
//        public class Properties {
//            private String nickname;
//        }

        @Getter
        public class KakaoAccount {
//            private String email;
//            private Boolean is_email_verified;
//            private Boolean has_email;
//            private Boolean profile_nickname_needs_agreement;
//            private Boolean email_needs_agreement;
//            private Boolean is_email_valid;
            private Profile profile;

            @Getter
            public class Profile {
                private String nickname;
                private String profile_image_url;
            }
        }
    }
}