package dto;

import lombok.*;

@Setter
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {
    private String username;
    private String password;
    private String firstName;
    private String lastName;


}
