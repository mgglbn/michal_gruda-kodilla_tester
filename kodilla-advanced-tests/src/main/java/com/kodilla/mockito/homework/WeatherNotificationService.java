package com.kodilla.mockito.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;

import java.util.*;

public class WeatherNotificationService {
    Map<String, Set<Client>> regionsSetMap = new HashMap<>();

    public void addSubscriber(String region, Client client){
        if(!regionsSetMap.containsKey(region)){
            regionsSetMap.put(region,new HashSet<>());
        }
        regionsSetMap.get(region).add(client);
    }

    public void removeSubscriberFromRegion(String region, Client client){
        if(regionsSetMap.containsKey(region)){
            regionsSetMap.get(region).remove(client);
        }
    }

    public void removeSubscriberFromAll(Client client){
        regionsSetMap.keySet().forEach(key  ->regionsSetMap.get(key).remove(client)); //Wiem że można to uprościć ale nie umiem;)
    }

    public void sendNotificationToRegion(String region, Notification notification){
        if(regionsSetMap.containsKey(region)){
            regionsSetMap.get(region).forEach(client -> client.receive(notification));
        }
    }

    public  void sendNotificationToAll(Notification notification){
        Set<Client> clients = new HashSet<>();
        regionsSetMap.keySet().forEach(key  ->regionsSetMap.get(key).forEach(client -> clients.add(client)));
        clients.forEach(client -> client.receive(notification));  //czy da się w jednym streamie????
    }

    public void deleteRegion(String region){
        regionsSetMap.remove(region);
    }
}
