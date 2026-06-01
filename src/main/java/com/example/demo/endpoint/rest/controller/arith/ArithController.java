package com.example.demo.endpoint.rest.controller.arith;

import static org.apache.coyote.http11.Constants.a;

import com.example.demo.service.ArithService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ArithController {
  private final ArithService arithService;

  @GetMapping("/add")
  public long add(@RequestParam long a, @RequestParam long b) {
    return arithService.add(a, b);
  }

  @GetMapping("/substract")
  public long substract(@RequestParam long a, @RequestParam long b) {
    return arithService.substract(a, b);
  }

  @GetMapping("/multiply")
  public long multiply(@RequestParam long a, @RequestParam long b) {
    return arithService.multiply(a, b);
  }

  @GetMapping("/divide")
  public long divide(@RequestParam long a, @RequestParam long b) {
    return arithService.divide(a, b);
  }
}
