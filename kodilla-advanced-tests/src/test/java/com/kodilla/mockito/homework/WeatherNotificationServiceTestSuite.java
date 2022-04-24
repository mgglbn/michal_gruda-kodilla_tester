package com.kodilla.mockito.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherNotificationServiceTestSuite {
    WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
    Client firstClient = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Client thirdClient = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);

    @BeforeEach
    public void initializeTest() {
        weatherNotificationService.addSubscriber("A", firstClient);
        weatherNotificationService.addSubscriber("C", firstClient);
        weatherNotificationService.addSubscriber("A", secondClient);
        weatherNotificationService.addSubscriber("B", thirdClient);
    }

    @Test
    public void notSubscribedClientShouldNotReceiveNotificationForAll() {
        Client fourthClient = Mockito.mock(Client.class);
        weatherNotificationService.sendNotificationToAll(notification);
        Mockito.verify(fourthClient, Mockito.never()).receive(notification);
    }

    @Test
    public void notificationToAllShouldBeSentToAllSubscribedClients() {

        weatherNotificationService.sendNotificationToAll(notification);
        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
    }

    @Test
    public void notSubscribedClientShouldNotReceiveNotificationForOtherRegion() {
        weatherNotificationService.sendNotificationToRegion("B", notification);
        Mockito.verify(firstClient, Mockito.never()).receive(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotificationForSameRegion() {
        weatherNotificationService.sendNotificationToRegion("A", notification);
        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
    }

    @Test
    public void subscribedClientForManyRegionsShouldReceiveMultiNotifications() {
        weatherNotificationService.sendNotificationToRegion("A", notification);
        weatherNotificationService.sendNotificationToRegion("C", notification);
    }

    @Test
    public void shouldSendOnlyOneNotificationToAllToMultiTimeSubscriber() {
        weatherNotificationService.addSubscriber("A", firstClient);
        weatherNotificationService.addSubscriber("A", firstClient);
        weatherNotificationService.addSubscriber("A", firstClient);
        weatherNotificationService.addSubscriber("C", firstClient);
        weatherNotificationService.addSubscriber("C", firstClient);
        weatherNotificationService.sendNotificationToAll(notification);
        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldSendOnlyOneNotificationToRegionToMultiTimeSubscriber() {
        weatherNotificationService.addSubscriber("A", firstClient);
        weatherNotificationService.addSubscriber("A", firstClient);
        weatherNotificationService.addSubscriber("A", firstClient);
        weatherNotificationService.addSubscriber("C", firstClient);
        weatherNotificationService.addSubscriber("C", firstClient);
        weatherNotificationService.sendNotificationToRegion("A", notification);
        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
    }

    @Test
    public void unsubscribedClientFromRegionShouldNotReceiveNotification() {
        weatherNotificationService.removeSubscriberFromRegion("A", firstClient);
        weatherNotificationService.sendNotificationToRegion("A", notification);
        Mockito.verify(firstClient, Mockito.never()).receive(notification);
    }

    @Test
    public void unsubscribedClientFromAllShouldNotReceiveAnyNotification() {
        weatherNotificationService.removeSubscriberFromAll(firstClient);
        weatherNotificationService.sendNotificationToRegion("A", notification);
        weatherNotificationService.sendNotificationToAll(notification);
        Mockito.verify(firstClient, Mockito.never()).receive(notification);
    }

    @Test
    public void deletedRegionShouldNotReceiveAnyNotificationsForClients() {
        weatherNotificationService.deleteRegion("A");
        weatherNotificationService.sendNotificationToRegion("A", notification);
        Mockito.verify(firstClient, Mockito.never()).receive(notification);
        Mockito.verify(secondClient, Mockito.never()).receive(notification);
    }
}