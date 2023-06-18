package ro.sda.spring;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    static ObjectMapper mapper = new ObjectMapper();
    public static void main(String[] args) throws JsonProcessingException {
        
        serializedAndPrint(new User("Catalin", "Manaila", 25));
        deserializedAndPrint("{\"firstName\":\"Catalin\",\"lastName\":\"Manaila\",\"age\":25}");


    }
    private static void serializedAndPrint(User u) throws JsonProcessingException {
        String serialized = mapper.writeValueAsString(u);//serializam userul u1(transformam din obiectul u1 in json object)
        System.out.println(serialized);

    }

    private static void deserializedAndPrint(String jsonObject) throws JsonProcessingException {
        //deserializing an json means to transform from json format toa java object(POJO - plain old java object)
        User user = mapper.readValue(jsonObject, User.class);
        System.out.println(user);
    }
}