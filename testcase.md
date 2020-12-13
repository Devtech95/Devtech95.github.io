
## Log Protection Test Case


|  Test Case ID   |           preconditions               |  Input Data  |                 Action                     |           Postconditions           |  
| --------------- | ------------------------------------- |  ----------  | ------------------------------------------ | ---------------------------------- |
|    TC-63001     |    Log, Algorithm Hash, Login evert   |  Login evert | 1.Login evert -> Algorithm Hash->          |   Information must not be edited   |
|                 |                                       |              |  Log -> Hash file(1)                       |                                    | 
|                 |                                       |              |  2.Algorithm Hash-> Log -> Hash file(2) -> |                                    |
|                 |                                       |              |  Verify Hash(1) = Hash(2)                  |                                    |





Team Author
---------------------------------------
> - Narunart vongeium
> - Theerapong kanrawong