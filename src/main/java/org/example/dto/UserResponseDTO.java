package org.example.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.entity.BaseEntity;
import org.example.entity.Part;
import org.example.entity.State;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Component
public class UserResponseDTO  {


    @Getter
    @Setter
    public static class LoginResponseWithTokenDTO {
        private LoginResponseDTO loginResponseDTO;
        private String token;

        public LoginResponseWithTokenDTO(LoginResponseDTO loginResponseDTO, String token) {
            this.loginResponseDTO = loginResponseDTO;
            this.token = token;
        }
    }

    @Getter
    @Setter
    public static class LoginResponseDTO {

        String email;
        String password;


        public LoginResponseDTO(String email, String password) {
            this.email = email;
            this.password=password;
        }

    }

    @Getter
    @Setter
    public static class adminWaitingResponseDTO extends BaseEntity {
        String name;

        String email;
        LocalDateTime  created_at;



        public adminWaitingResponseDTO(String email, String name, LocalDateTime created_at) {
            this.email = email;
            this.name = name;
            this.created_at=created_at;
        }

    }

    @Getter
    @Setter
    public static class adminmemberResponseDTO extends BaseEntity {
        String name;

        String email;
        int cardinal;
        Part part;



        public adminmemberResponseDTO(String email, String name,int cardinal,Part part) {
            this.email = email;
            this.name = name;
            this.cardinal=cardinal;
            this.part=part;
        }

    }

    @Getter
    @Setter
    public static class VerficationResponseDTO{
        String email;

        public VerficationResponseDTO(String email){
            this.email=email;
        }

    }

}
