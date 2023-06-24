package ro.sda.spring.lombok;

import lombok.*;

//@Data- is a shortcut for @Getter @Setter @ToString @EqualsAndHashCode

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor



public class User {
    private String firstName;
    private String lastName;
    private int age;

}
