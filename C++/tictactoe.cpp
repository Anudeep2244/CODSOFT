#include <iostream>
using namespace std;

void draw_board(const char board[3][3]) {
    cout << "-------------\n";
    for (int i = 0; i < 3; i++) {
        cout << "| ";
        for (int j = 0; j < 3; j++) {
            cout << board[i][j] << " | ";
        }
        cout << "\n-------------\n";
    }
}

bool check_win(const char board[3][3], char player) {
    // Check rows, columns, and diagonals
    for (int i = 0; i < 3; i++) {
        if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
            return true;
        if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
            return true;
    }
    if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
        return true;
    if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
        return true;
    return false;
}

// Function to check for a draw
bool check_draw(const char board[3][3]) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j] == ' ') {
                return false;
            }
        }
    }
    return true;
}

// Function to initialize the board
void init_board(char board[3][3]) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            board[i][j] = ' ';
        }
    }
}

// Function to prompt for player move and validate input
void player_move(char board[3][3], char player, int& row, int& col) {
    while (true) {
        cout << "Player " << player << ", enter row (1-3) and column (1-3): ";
        cin >> row >> col;

        // Adjust input to 0-indexed
        row--;
        col--;

        // Check if input is valid
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
            break;
        } else {
            cout << "Invalid move. Try again.\n";
        }
    }
}

// Main game function
void playGame() {
    
}

int main() {
    char again;

    do {
        char board[3][3];
        char player = 'X';
        int row, col;
        bool gameEnded = false;

        init_board(board);

        cout << "Welcome to Tic-Tac-Toe!\n";

        for (int turn = 0; turn < 9 && !gameEnded; turn++) {
            draw_board(board);

            // Get player move
            player_move(board, player, row, col);

            // Make the move
            board[row][col] = player;

            // Check for a win
            if (check_win(board, player)) {
                draw_board(board);
                cout << "Player " << player << " wins!\n";
                gameEnded = true;
            } else if (check_draw(board)) {
                draw_board(board);
                cout << "It's a draw!\n";
                gameEnded = true;
            }

            // Switch player
            player = (player == 'X') ? 'O' : 'X';
        }
        cout << "Do you want to play again? (y/n): ";
        cin >> again;
    } while (again == 'y' || again == 'Y');

    cout << "Thanks for playing!" << endl;
    return 0;
}
