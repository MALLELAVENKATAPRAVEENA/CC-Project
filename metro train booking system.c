#include <stdio.h>

void viewStations() {
    printf("\nAvailable Stations:\n1. Downtown\n2. Uptown\n3. Suburbia\n");
}

int main() {
    int choice;
    int source, destination;
    int fare = 0;

    while (1) {
        printf("\n--- Metro Train Booking System ---\n");
        printf("1. View stations\n2. Book ticket\n3. Show ticket details\n4. Calculate fare\n5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                viewStations();
                break;
            case 2:
                printf("Enter source (1-3) and destination (1-3): ");
                scanf("%d %d", &source, &destination);
                // logic to save booking
                break;
            case 4:
                // example fare logic
                fare = 20; 
                printf("Estimated fare: $%d\n", fare);
                break;
            case 5:
                return 0;
            default:
                printf("Invalid choice, try again.\n");
        }
    }
    return 0;
}
