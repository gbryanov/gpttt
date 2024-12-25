// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract SimpleStorage {

    // Declare a state variable to store a number
    uint256 private storedNumber;

    // Event to emit when the number is updated
    event NumberUpdated(uint256 newNumber);

    // Function to store a number
    function store(uint256 number) public {
        storedNumber = number;
        emit NumberUpdated(number);  // Emit the event when the number is updated
    }

    // Function to retrieve the stored number
    function retrieve() public view returns (uint256) {
        return storedNumber;
    }

    // Function to increment the stored number by a given value
    function increment(uint256 value) public {
        storedNumber += value;
        emit NumberUpdated(storedNumber);
    }

    // Function to decrement the stored number by a given value
    function decrement(uint256 value) public {
        require(storedNumber >= value, "Cannot decrement below 0");
        storedNumber -= value;
        emit NumberUpdated(storedNumber);
    }
}
