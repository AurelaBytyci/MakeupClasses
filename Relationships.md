
## Relationships between entities

1. Booking
 *Client- many-to-one
 *Lesson- many-to-one
 *Seat- one-to-one
 *Gift- one-to-one

2. Client
 *Booking- one-to-many
 *Gift- one-to-many

3. Gift
 *Booking- one-to-one
 *Client- many-to-one
 *Lesson- many-to-one
 *Seat- many-to-one

4. Lesson
 *Booking- one-to-many
 *Realization- one-to-many
 *Gift- one-to-many

5. Realization
 *Lesson- many-to-one
 *Room- many-to-one

6. Room
 *Seat- one-to-many
 *Realization- one-to-many

7. Seat
 *Room- many-to-one
 *Gift- one-to-many