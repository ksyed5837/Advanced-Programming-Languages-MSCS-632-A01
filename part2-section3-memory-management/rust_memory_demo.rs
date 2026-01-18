fn main() {
    let data = vec![0; 10_000_000];
    println!("Allocated vector with {} items", data.len());

    let sum: i32 = data.iter().sum();
    println!("Sum: {}", sum);
}
