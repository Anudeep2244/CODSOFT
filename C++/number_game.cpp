#include <iostream>
#include<cstdlib>

using namespace std;

int main() {
    int comp,user;
    cout << "*** Number Game ***";

    while (true) {
        comp = rand();
        cout << "\nGuess a number : ";
        cin >> user;
        
        if (comp == user) {
            cout << "\nYou guessed it correctly."<<endl;
            cout << "Guessed number : "<<user;
            break;
        }
        else if (user > comp) {
            cout << "Your guessed number is greater than computer's.";
        }
        else {
            cout << "Your guessed number is lesser than computer's.";
        }
    }    
}
