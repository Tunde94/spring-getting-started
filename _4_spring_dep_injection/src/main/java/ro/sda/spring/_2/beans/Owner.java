package ro.sda.spring._2.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Owner {
    private String name;
    private Dog dog;

}
