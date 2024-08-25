#include <iostream>
#include <string>

using namespace std;

const int MAX = 100;

class Task {
    string desc;
    bool cmplt;

public:
    Task(string desc = "", bool cmplt = false) : desc(desc), cmplt(cmplt) {}

    string get_desc() const {
        return desc;
    }

    bool is_cmplt() const {
        return cmplt;
    }

    // Setter for completion status
    void set_cmplt() {
        cmplt = true;
    }

    // Method to display task information
    void display() const {
        cout << desc << (cmplt ? " (Completed)" : " (Pending)") << "\n";
    }
};

int main() {
    Task t[MAX];
    int ch;
    int index;
    string desc;
    int count = 0;

    do {
        cout << "\nTo-Do List Menu:"<<endl;
        cout << "1. Add Task"<<endl;
        cout << "2. View Tasks"<<endl;
        cout << "3. Mark Task as Completed"<<endl;
        cout << "4. Remove Task"<<endl;
        cout << "5. Exit"<<endl;
        cout << "Enter your choice: ";
        cin >> ch;

        if (ch > 6 || ch < 1) {
            cout << "Invalid input. Please enter a number.\n";
            continue;
        }

        switch (ch) {
            case 1:
                if (count < MAX) {
                    cout << "Enter task description: ";
                    cin >> desc;
                    t[count++] = Task(desc);
                }
                else {
                    cout << "Task list is full.\n";
                }
                break;
            case 2:
                if (count == 0) {
                    cout << "No tasks in the list.\n";
                }
                else {cout << "Tasks:\n";
                    for (int i = 0; i < count; i++) {
                        cout << i + 1 << ". ";
                        t[i].display();
                    }
                }
                break;
            case 3:
                cout << "Enter task number to mark as completed: ";
                cin >> index;
                if (index < 1 || index > count) {
                    cout << (index == 0 ? "The list is empty." : "Invalid index.") << endl;
                }
                else {
                    t[index - 1].set_cmplt();
                }
                break;
            case 4:
                cout << "Enter task number to remove: ";
                cin >> index;
                if (index < 1 || index > count) {
                    cout << (count == 0 ? "The list is empty." : "Invalid index.") << endl;
                }
                else {
                    string rm_task = t[index - 1].get_desc();
                    for (int i = index - 1; i < count - 1; i++) {
                        t[i] = t[i+1];
                    }
                    count -= 1;
                    cout << "Successfully removed task no. " << index << " (" << rm_task << ")" << endl;
                }
                break;
            case 5:
                cout << "Thankyou!\n";
                break;
            default:
                cout << "Invalid choice. Please try again.\n";
        }
    } while (ch != 5);

    return 0;
}

