#include <iostream>

using namespace std;

int main() {
    double num_1, num_2, res;
    char operation;

    cout << "*** Basic Calculator ***" << endl;
    cout << "\nPlease enter two numbers." << endl;
    cout << "Enter the first number: ";
    cin >> num_1;
    cout << "Enter the second number: ";
    cin >> num_2;
    cout << "Enter the operation [ + , - , * , / ]: ";
    cin >> operation;
    
    switch (operation) {
        case '+':
            res = num_1 + num_2;
            cout << num_1 << " + " << num_2 << " = " << res << endl;
            break;
        case '-':
            res = num_1 - num_2;
            cout << num_1 << " - " << num_2 << " = " << res << endl;
            break;
        case '*':
            res = num_1 * num_2;
            cout << num_1 << " * " << num_2 << " = " << res << endl;
            break;
        case '/':
            if (num_2 != 0) {
                res = num_1 / num_2;
                cout << num_1 << " / " << num_2 << " = " << res << endl;
            } else {
                cout << "Aye, we can't divide a number by zero, can we ?" << endl;
            }
            break;
        default:
            cout << "Invalid operation." << endl;
            break;
    }
    return 0;
}
