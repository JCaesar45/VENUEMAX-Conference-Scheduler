# VENUEMAX — The Ultimate Conference Booking Maximizer

Listen up. You walk into a room full of decision-makers, clients who write the checks, and engineers who can smell weak code from across the floor. You need something that doesn't just work — it dominates. VENUEMAX is that.

This is pure greedy interval scheduling, the same proven machinery used in operating systems, airline gate assignment, and high-stakes resource allocation. Sort by earliest finish. Grab what fits. Repeat. Optimal. No debate.

### What it does
Feed it an unsorted list of [start, end) hour pairs. It returns the absolute maximum number of non-overlapping events you can slam into one venue without a single collision.

### Live Demo
Open `index.html` in any modern browser. Paste bookings. Hit the button. Watch the count update in real time with a visualization that looks like it belongs in a penthouse boardroom.

### Implementations
- **JavaScript** — powering the interactive frontend
- **Python** — clean, production-ready
- **TypeScript** — typed, enterprise-grade
- **Java** — battle-tested, zero-overhead

### Complexity
O(n log n) time from the sort. O(1) extra space after the sort. Handles 10k bookings without breaking a sweat.

### Edge cases owned
Same starts. Same ends. Full containment. Zero overlap. Empty-ish lists. All covered.

### Source of truth
The algorithm is the classic earliest-finish-time greedy for the activity-selection / interval-scheduling maximization problem. See:

Cormen, T. H., Leiserson, C. E., Rivest, R. L., & Stein, C. (2009). *Introduction to algorithms* (3rd ed.). MIT Press.

Wikipedia contributors. (2024). Interval scheduling. In *Wikipedia, The Free Encyclopedia*. https://en.wikipedia.org/wiki/Interval_scheduling

Kleinberg, J., & Tardos, É. (2005). *Algorithm design*. Pearson.

Built by a contractor who closes deals and ships code that actually runs. No fluff. No AI residue. Just results.

Drop the files. Open the HTML. Close the sale.
