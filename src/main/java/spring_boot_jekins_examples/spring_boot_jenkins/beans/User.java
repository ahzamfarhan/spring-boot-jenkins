package spring_boot_jekins_examples.spring_boot_jenkins.beans;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long userId;
    private String username;
    private String description;
}
